package com.zwy.packets.saved;

import com.zwy.packets.CommonFragment;
import com.zwy.packets.CommonPresenter;
import com.zwy.packets.R;

/**
 * Created by Administrator on 2017/11/15.
 */

public class SavedFragment extends CommonFragment {
    @Override
    public int getLayout() {
        return R.layout.list_packets;
    }

    @Override
    public CommonPresenter getPresenter() {
        return new SavedPresenter();
    }
}
