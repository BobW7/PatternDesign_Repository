package com.bob;

// Caretaker（管理者）
public class SettingsCareTaker {
    private Memento memento;

    public void saveSettings(Settings settings) {
        memento = settings.save();
    }

    public void restoreSettings(Settings settings) {
        settings.restore(memento);
    }
}