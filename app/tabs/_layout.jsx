import { Tabs } from "expo-router";
import { Ionicons } from "@expo/vector-icons";

export default function TabLayout() {
  return (
    <Tabs
      screenOptions={{
        tabBarActiveTintColor: "black",   // 선택된 탭 아이콘/텍스트 색
        tabBarInactiveTintColor: "gray", // 선택 안된 탭 아이콘/텍스트 색
        tabBarStyle: {
          backgroundColor: "white", // 하단 탭 바 배경 흰색
        },
        tabBarLabelStyle: {
          fontFamily: "AppleSDGothicNeo-Regular", // 앞에서 쓰던 애플 기본 폰트
        },
      }}
    >
      <Tabs.Screen
        name="home"
        options={{
          title: "홈",
          tabBarIcon: ({ color, size }) => (
            <Ionicons name="home" size={size} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="map"
        options={{
          title: "지도",
          tabBarIcon: ({ color, size }) => (
            <Ionicons name="map" size={size} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="current"
        options={{
          title: "현황",
          tabBarIcon: ({ color, size }) => (
            <Ionicons name="pulse" size={size} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="guardian"
        options={{
          title: "보호자",
          tabBarIcon: ({ color, size }) => (
            <Ionicons name="people" size={size} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="settings"
        options={{
          title: "설정",
          tabBarIcon: ({ color, size }) => (
            <Ionicons name="settings" size={size} color={color} />
          ),
        }}
      />
    </Tabs>
  );
}
