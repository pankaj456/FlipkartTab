package com.skpissay.baseproject.screens.ui.interfaces;

import android.view.View;

import com.skpissay.baseproject.models.Page;
import com.skpissay.baseproject.models.Products;
import com.skpissay.baseproject.models.User;

/**
 * Created by skpissay on 25/06/18.
 */

public interface RecyclerUsersListener {
    public void onInfoClick(int pPostion, Products pPage, View pView);
    public void onInfoLongClick(int pPostion, Products pPage, View pView);
}
