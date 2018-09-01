package com.example.yuanping.imageload.picasso;

import android.content.Context;
import android.widget.AbsListView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

/**
 * @created by PingYuan at 9/1/18
 * @email: husteryp@gmail.com
 * @description:
 */
public class GridScrollListener implements AbsListView.OnScrollListener {

    private Context mContext;

    public GridScrollListener(Context context) {
        this.mContext = context;
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        Picasso picasso = Picasso.get();
        if (scrollState == SCROLL_STATE_IDLE || scrollState == SCROLL_STATE_TOUCH_SCROLL) {
            picasso.resumeTag(mContext);
        } else {
            picasso.pauseTag(mContext);
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int
            totalItemCount) {
    }
}
