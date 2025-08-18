// app/tabs/_layout.jsx
import { Tabs } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Platform } from 'react-native';

const baseFont = Platform.select({ ios: 'System', android: 'sans-serif', web: 'system-ui' });

export default function TabLayout() {
  return (
    <Tabs
      screenOptions={({ route }) => ({
        headerShown: false,
        tabBarActiveTintColor: '#000000',   // 선택된 탭 → 블랙
        tabBarInactiveTintColor: '#8E8E93', // 선택 안된 탭 → 그레이
        tabBarStyle: {
          backgroundColor: '#FFFFFF', // 배경 흰색
          borderTopWidth: 0.5,
          borderTopColor: '#E5E5EA',
          height: 70,
          paddingBottom: 10,
        },
        tabBarLabelStyle: {
          fontFamily: baseFont,
          fontSize: 12,
          marginTop: -4,
        },
        tabBarIcon: ({ color }) => {
          let iconName;

          if (route.name === 'home') iconName = 'home-outline';
          else if (route.name === 'map') iconName = 'map-outline';
          else if (route.name === 'current') iconName = 'pulse-outline';
          else if (route.name === 'guardian') iconName = 'people-outline';
          else if (route.name === 'settings') iconName = 'settings-outline';

          return <Ionicons name={iconName} size={22} color={color} />;
        },
      })}
    >
      <Tabs.Screen name="home" options={{ title: '홈' }} />
      <Tabs.Screen name="map" options={{ title: '지도' }} />
      <Tabs.Screen name="current" options={{ title: '현황' }} />
      <Tabs.Screen name="guardian" options={{ title: '보호자' }} />
      <Tabs.Screen name="settings" options={{ title: '설정' }} />
    </Tabs>
  );
}
