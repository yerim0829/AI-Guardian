import { View, Text, StyleSheet, ScrollView, TouchableOpacity } from "react-native";

export default function MapScreen() {
  return (
    <ScrollView style={s.container}>
      {/* 지도 로딩 */}
      <View style={s.mapBox}>
        <Text style={s.mapText}>지도 로딩 중… {"\n"}Google Maps API 연동 필요</Text>
      </View>

      {/* 주변 대피소 */}
      <Text style={s.sectionTitle}>📍 주변 대피소 (3곳)</Text>

      {/* 대피소 카드 */}
      <View style={s.card}>
        <Text style={s.cardTitle}>서울시청 긴급대피소 <Text style={s.badge}>운영중</Text></Text>
        <Text style={s.subText}>서울특별시 중구 세종대로 110</Text>
        <Text style={s.capacity}>320 / 500명</Text>

        <View style={s.actions}>
          <TouchableOpacity style={s.button}>
            <Text style={s.buttonText}>길찾기</Text>
          </TouchableOpacity>
          <TouchableOpacity style={s.outlineBtn}>
            <Text style={s.outlineBtnText}>연락</Text>
          </TouchableOpacity>
        </View>
      </View>

      {/* 또 다른 카드 */}
      <View style={s.card}>
        <Text style={s.cardTitle}>강남구청 의료센터 <Text style={s.badge}>운영중</Text></Text>
        <Text style={s.subText}>서울특별시 강남구 테헤란로 426</Text>
        <Text style={s.capacity}>150 / 200명</Text>

        <View style={s.actions}>
          <TouchableOpacity style={s.button}>
            <Text style={s.buttonText}>길찾기</Text>
          </TouchableOpacity>
          <TouchableOpacity style={s.outlineBtn}>
            <Text style={s.outlineBtnText}>연락</Text>
          </TouchableOpacity>
        </View>
      </View>
    </ScrollView>
  );
}

const s = StyleSheet.create({
  container: { flex: 1, backgroundColor: "#fff", padding: 16 },
  mapBox: {
    backgroundColor: "#f2f2f7",
    height: 180,
    borderRadius: 12,
    alignItems: "center",
    justifyContent: "center",
    marginBottom: 20,
  },
  mapText: { color: "#888", fontSize: 14, textAlign: "center" },
  sectionTitle: { fontSize: 18, fontWeight: "700", marginBottom: 12 },
  card: {
    backgroundColor: "#fff",
    borderRadius: 12,
    padding: 16,
    marginBottom: 16,
    shadowColor: "#000",
    shadowOpacity: 0.1,
    shadowOffset: { width: 0, height: 2 },
    shadowRadius: 6,
    elevation: 3,
  },
  cardTitle: { fontSize: 16, fontWeight: "600", marginBottom: 4 },
  badge: {
    backgroundColor: "#007AFF",
    color: "white",
    fontSize: 12,
    paddingHorizontal: 6,
    paddingVertical: 2,
    borderRadius: 6,
    overflow: "hidden",
  },
  subText: { color: "#666", marginBottom: 6 },
  capacity: { fontWeight: "500", marginBottom: 12 },
  actions: { flexDirection: "row", justifyContent: "space-between" },
  button: {
    flex: 1,
    backgroundColor: "#007AFF", // ✅ 애플 블루
    paddingVertical: 10,
    borderRadius: 8,
    alignItems: "center",
    marginRight: 8,
  },
  buttonText: { color: "#fff", fontWeight: "600" },
  outlineBtn: {
    flex: 1,
    borderWidth: 1,
    borderColor: "#007AFF",
    borderRadius: 8,
    paddingVertical: 10,
    alignItems: "center",
  },
  outlineBtnText: { color: "#007AFF", fontWeight: "600" },
});
