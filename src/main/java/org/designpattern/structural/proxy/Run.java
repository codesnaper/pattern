package org.designpattern.structural.proxy;

public class Run {

    public static void main(String[] args){
        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(twitterService.getTimeline("Sample"));
        twitterService= (TwitterService) SecurityProxy.newInstance(new TwitterService() {
            @Override
            public String getTimeline(String userName) {
                return String.format("Returning timeline for user %s with second and updated stub",userName);
            }
        });
        System.out.println(twitterService.getTimeline("sample"));
    }

}
