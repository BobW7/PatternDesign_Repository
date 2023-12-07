package com.bob.test;

import com.bob.Settings;
import com.bob.SettingsCareTaker;

// 测试代码
public class MementoPatternTest {
    public static void main(String[] args) {
        // 创建 Originator（发起人）
        Settings settings = new Settings();

        // 创建 Caretaker（管理者）
        SettingsCareTaker caretaker = new SettingsCareTaker();

        // 设置初始设置
        settings.setThemeColor("Blue");
        settings.setFont("Arial");
        settings.setLayout("Grid");

        // 保存当前设置
        caretaker.saveSettings(settings);

        // 修改设置
        settings.setThemeColor("Red");
        settings.setFont("Verdana");
        settings.setLayout("Flow");

        // 显示当前设置
        System.out.println("Current Settings:");
        settings.displaySettings();

        // 恢复到之前的设置
        caretaker.restoreSettings(settings);

        // 显示恢复后的设置
        System.out.println("Restored Settings:");
        settings.displaySettings();
    }
}