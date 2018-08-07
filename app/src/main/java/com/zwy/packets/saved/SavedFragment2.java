package com.zwy.packets.saved;

import com.zwy.packets.CommonPresenter;
import com.zwy.packets.FakeFragment;
import com.zwy.packets.R;

/**
 * Created by Administrator on 2017/11/30.
 */

public class SavedFragment2 extends FakeFragment {

    private SavedPresenter mP=null;

    @Override
    public int getLayout() {
        return R.layout.list_packets;
    }

    @Override
    public CommonPresenter getPresenter() {
        if (mP==null)
            mP=new SavedPresenter();

        return mP;
    }
}
