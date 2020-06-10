package ru.ifmo.database.server.logic.impl;

public class DatabaseStoringUnit {

    private final byte[] key;
    private final int keySize;
    private final byte[] value;
    private final int valueSize;

    public DatabaseStoringUnit(String objectKey, String objectValue) {
        this(objectKey.getBytes(), objectValue.getBytes());
    }

    public DatabaseStoringUnit(byte[] key, byte[] value) {
        this.key = key;
        keySize = key.length;
        this.value = value;
        valueSize = value.length;
    }

    public int getKeySize() {
        return keySize;
    }

    public byte[] getValue() {
        return value;
    }

    public int getValueSize() {
        return valueSize;
    }

    public byte[] getKey() {
        return this.key;
    }

    public int getUnitSize() {
        return 8 + this.keySize + this.valueSize;
    }
}
