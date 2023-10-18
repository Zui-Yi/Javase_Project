package com.rx.videodemo;

public class Operator {

    private Video[] videos;
    public Operator(Video[] videos) {
        this.videos=videos;
    }

    public void showAllVideo(){
        System.out.println("系统全部电影信息如下：");
        for (int i = 0; i < videos.length; i++) {
            Video vd=videos[i];
            System.out.println("编号："+vd.getId());
            System.out.println("影名："+vd.getVideoName());
            System.out.println("价格："+vd.getPrice());
            System.out.println("--------------------");
        }
    }

    public void searchVideoById(int id){
        System.out.println("该电影详细信息如下：");
        for (int i = 0; i < videos.length; i++) {
            if(id==videos[i].getId()){
                Video vd=videos[i];
                System.out.println("编号："+vd.getId());
                System.out.println("影名："+vd.getVideoName());
                System.out.println("价格："+vd.getPrice());
                System.out.println("评分："+vd.getScore());
                System.out.println("导演："+vd.getDirName());
                System.out.println("演员："+vd.getActName());
                System.out.println("想看："+vd.getWannaWatch());
                System.out.println("--------------------");
                return;
            }
        }
        System.out.println("该电影不存在！");
        System.out.println("--------------------");
    }


}
