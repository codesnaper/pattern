package org.designpattern.structural.proxy;

public class TwitterServiceStub  implements TwitterService{

    @Override
    public String getTimeline(String userName) {
        return String.format("Returing the timeline for user %s. With a stub class provided",userName);
    }
}
