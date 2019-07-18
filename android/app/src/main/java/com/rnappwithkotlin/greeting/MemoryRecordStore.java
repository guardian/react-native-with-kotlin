package com.rnappwithkotlin.greeting;

import com.gu.ophan.RecordStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MemoryRecordStore implements RecordStore {

    private Map<String, byte[]> records = new HashMap<>();

    @Override
    public List<byte[]> getRecords() {
        return new ArrayList<>(records.values());
    }

    @Override
    public void putRecord(String s, byte[] bytes) {
        records.put(s, bytes);
    }

    @Override
    public void removeRecord(String s) {
        records.remove(s);
    }
}
