import { View, Text, StyleSheet, TouchableOpacity, Platform } from 'react-native';
import { useRouter } from 'expo-router';
import { MotiText, MotiView } from 'moti';

// StartScreen과 같은 폰트
const baseFont = Platform.select({ ios: 'System', android: 'sans-serif', web: 'system-ui' });

export default function GuardianInfo() {
  const router = useRouter();

  return (
    <View style={s.container}>
      {/* 안내 문구 애니메이션 */}
      <View style={s.textBox}>
        <MotiText
          from={{ opacity: 0, translateY: 20 }}
          animate={{ opacity: 1, translateY: 0 }}
          transition={{ type: 'timing', duration: 1000 }}
          style={s.text}
        >
          비상시 연결할 {"\n"}당신의 보호자 연락처를 입력해주세요
        </MotiText>
      </View>

      {/* 버튼 애니메이션 */}
      <MotiView
        from={{ opacity: 0, translateY: 30 }}
        animate={{ opacity: 1, translateY: 0 }}
        transition={{ type: 'timing', duration: 600, delay: 200 }}
        style={{ width: '100%' }}
      >
        <TouchableOpacity style={s.btn} onPress={() => router.push('/forms/guardianForm')}>
          <Text style={s.btnText}>다음</Text>
        </TouchableOpacity>
      </MotiView>
    </View>
  );
}

const s = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#FFFFFF',
    paddingHorizontal: 24,
    justifyContent: 'space-between', // 문구는 가운데, 버튼은 아래
    alignItems: 'center',
  },
  textBox: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  text: {
    fontFamily: baseFont,
    fontSize: 28,
    lineHeight: 38,
    fontWeight: '700',
    textAlign: 'center',
    color: '#111111',
  },
  btn: {
    backgroundColor: '#000000',
    width: '100%',
    paddingVertical: 18,
    borderRadius: 0,
    alignItems: 'center',
  },
  btnText: {
    fontFamily: baseFont,
    color: '#FFFFFF',
    fontSize: 18,
    fontWeight: '700',
  },
});
