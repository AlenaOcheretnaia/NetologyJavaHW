package ru.netology.phonemissedcalls;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

//    Добавление пропущенного вызова.
    public void addMissedCall(String missedNumber) {
        LocalDateTime nowDate = LocalDateTime.now();
        missedCalls.put(nowDate, missedNumber);
        System.out.println(missedCalls);
    }

//    Очистка списка пропущенных вызовов.
    public void clearMissedCalls() {
        missedCalls.clear();
    }

    public Set<Map.Entry<LocalDateTime, String>> getEntryMissedCalls(){
        return missedCalls.entrySet();
    }

}
