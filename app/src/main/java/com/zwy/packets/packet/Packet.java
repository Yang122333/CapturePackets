package com.zwy.packets.packet;

/**
 * Created by liquanfei_sx on 2017/8/15.
 */

public class Packet {

    byte[] mData=null;
    public int mOffset=0;

    public Packet(byte[] data,int offset)
    {
        mData=data;
        mOffset=offset;
    }

    public byte[] getRawData()
    {
        return mData;
    }

    @Override
    public String toString() {
        return new String(mData);
    }
}
