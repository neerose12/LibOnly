package com.example.lib.channellist.view;


import com.example.lib.channellist.model.ChannelModel;

import java.util.ArrayList;

public interface ChannelView {
    void sendChannelList(ArrayList<ChannelModel> channelModels);
}
