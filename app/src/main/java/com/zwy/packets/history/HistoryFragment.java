package com.zwy.packets.history;

import com.zwy.packets.CommonFragment;
import com.zwy.packets.CommonPresenter;
import com.zwy.packets.R;

/**
 * Created by Administrator on 2017/11/8.
 */

public class HistoryFragment extends CommonFragment {

    private CommonPresenter mPresenter=new HistoryPresenter();

    @Override
    public int getLayout() {
        return R.layout.list_packets;
    }

    @Override
    public CommonPresenter getPresenter() {
        return mPresenter;
    }
}
