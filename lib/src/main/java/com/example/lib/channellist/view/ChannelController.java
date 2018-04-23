package com.example.lib.channellist.view;

import com.example.lib.channellist.model.ChannelModel;
import com.example.lib.channellist.presenter.ChannelImplementor;
import com.example.lib.channellist.presenter.ChannelPresenter;

import java.util.ArrayList;

import sun.rmi.runtime.Log;

public abstract class ChannelController implements ChannelView {


    ArrayList<ChannelModel> channelModels;

    public ChannelController() {
    }

    public void getChannelList(){
        ChannelPresenter channelPresenter = new ChannelImplementor(this);
        channelPresenter.getChannelList();
    }

    @Override
    public void sendChannelList(ArrayList<ChannelModel> channelModels) {
        allChannelList(channelModels);
    }

    protected abstract void allChannelList(ArrayList<ChannelModel> channelModels);
}
