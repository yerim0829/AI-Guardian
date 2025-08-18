import { useState, useEffect } from "react";
import {
  View,
  Text,
  TouchableOpacity,
  StyleSheet,
  Platform,
  ScrollView,
  Alert,
} from "react-native";
import * as Location from "expo-location";

const baseFont = Platform.select({ ios: "System", android: "sans-serif", web: "system-ui" });

export default function Home() {
  const [status, setStatus] = useState("✅ 안전");
  const [alerts, setAlerts] = useState([
    "태풍 ‘하이선’ 경보 · 2시간 전 · 진행중",
    "지진 감지 알림 · 완료",
    "홍수주의보 · 1일 전 · 해제",
  ]);
  const [locationEnabled, setLocationEnabled] = useState(false);
  const [address, setAddress] = useState("위치 확인 중...");

  // 📍 위치 권한 + 좌표 + 주소 가져오기
  useEffect(() => {
    (async () => {
      let { status } = await Location.requestForegroundPermissionsAsync();
      if (status !== "granted") {
        setLocationEnabled(false);
        setAddress("위치 권한 거부됨");
        return;
      }
      setLocationEnabled(true);

      // 좌표 가져오기
      let loc = await Location.getCurrentPositionAsync({});
      // 주소 변환
      let addr = await Location.reverseGeocodeAsync({
        latitude: loc.coords.latitude,
        longitude: loc.coords.longitude,
      });

      if (addr.length > 0) {
        const a = addr[0];
        // 도시 + 구/군 + 동 정도만 보여주기
        setAddress(`${a.region} ${a.city || a.district}`);
      }
    })();
  }, []);

  const handleSOS = () => {
    Alert.alert("🚨 긴급 신고", "긴급 신고가 전송되었습니다.");
  };

  const handleSafe = () => {
    setStatus("✅ 안전 (확인됨)");
    Alert.alert("✅ 상태 업데이트", "나의 상태가 '안전'으로 기록되었습니다.");
  };

  return (
    <View style={s.container}>
      {/* 헤더 */}
      <View style={s.header}>
        <Text style={s.logo}>📢 AI Guardian</Text>
        <Text style={s.status}>
          {locationEnabled ? "📍 위치 활성화 · " : "📍 위치 꺼짐 · "}
          {status}
        </Text>
      </View>

      {/* 현재 지역 / 상황 */}
      <View style={s.card}>
        <Text style={s.location}>{address}</Text>
        <Text style={s.subText}>
          {status.includes("위험") ? "⚠️ 태풍 경보 발령 중" : "현재 안전 지역"}
        </Text>
      </View>

      {/* 긴급 신고 버튼 */}
      <TouchableOpacity style={s.sosBtn} onPress={handleSOS}>
        <Text style={s.sosText}>🚨 긴급 신고 (SOS)</Text>
      </TouchableOpacity>

      {/* 나는 안전합니다 버튼 */}
      <TouchableOpacity style={s.safeBtn} onPress={handleSafe}>
        <Text style={s.safeText}>✅ 나는 안전합니다</Text>
      </TouchableOpacity>

      {/* 기능 버튼 */}
      <View style={s.row}>
        <TouchableOpacity style={s.subBtn} onPress={() => Alert.alert("📍 대피소 찾기")}>
          <Text style={s.subText}>📍 대피소 찾기</Text>
        </TouchableOpacity>
        <TouchableOpacity style={s.subBtn} onPress={() => Alert.alert("👨‍👩‍👧 보호자 연락")}>
          <Text style={s.subText}>👨‍👩‍👧 보호자 연락</Text>
        </TouchableOpacity>
      </View>

      {/* 최근 재난 알림 */}
      <View style={[s.card, s.alertBox]}>
        <Text style={s.sectionTitle}>🔔 최근 재난 알림</Text>
        <ScrollView>
          {alerts.map((a, i) => (
            <Text key={i} style={s.alert}>
              {a}
            </Text>
          ))}
        </ScrollView>
      </View>
    </View>
  );
}

const s = StyleSheet.create({
  container: { flex: 1, backgroundColor: "#f9f9f9", padding: 16 },
  header: { flexDirection: "row", justifyContent: "space-between", marginBottom: 16, alignItems: "center" },
  logo: { fontSize: 20, fontWeight: "700", fontFamily: baseFont },
  status: { fontSize: 14, color: "green", fontFamily: baseFont },
  card: { backgroundColor: "#fff", padding: 16, borderRadius: 10, marginBottom: 16 },
  location: { fontSize: 18, fontWeight: "600", fontFamily: baseFont },
  subText: { fontSize: 14, color: "#555", fontFamily: baseFont },
  sosBtn: { backgroundColor: "#d32f2f", paddingVertical: 20, borderRadius: 10, marginBottom: 12, alignItems: "center" },
  sosText: { color: "#fff", fontSize: 20, fontWeight: "700", fontFamily: baseFont },
  safeBtn: { backgroundColor: "green", paddingVertical: 18, borderRadius: 10, marginBottom: 12, alignItems: "center" },
  safeText: { color: "#fff", fontSize: 18, fontWeight: "600", fontFamily: baseFont },
  row: { flexDirection: "row", justifyContent: "space-between", marginBottom: 12 },
  subBtn: { backgroundColor: "#eee", flex: 1, paddingVertical: 16, borderRadius: 10, alignItems: "center", marginHorizontal: 4 },
  sectionTitle: { fontSize: 16, fontWeight: "700", marginBottom: 8, fontFamily: baseFont },
  alertBox: { flex: 1 },
  alert: { fontSize: 14, marginBottom: 6, fontFamily: baseFont },
});
