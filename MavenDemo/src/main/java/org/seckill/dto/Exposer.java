package org.seckill.dto;

/**
 * @Description
 * @Author chenxiangting
 * @Date 2018/10/21 22:45
 **/
public class Exposer {
    //是否开启秒杀
    private boolean pxposed;

    //一种加密措施
    private String md5;

    // ID
    private long seckillId;

    //系统当前时间（毫秒）
    private long now;

    // 秒杀开启时间
    private long start;

    // 秒杀结束时间
    private long end;

    public Exposer(boolean pxposed, String md5, long seckillId) {
        this.pxposed = pxposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean pxposed, long now, long start, long end) {
        this.pxposed = pxposed;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    public Exposer(boolean pxposed, long seckillId) {
        this.pxposed = pxposed;
        this.seckillId = seckillId;
    }

    public boolean isPxposed() {
        return pxposed;
    }

    public void setPxposed(boolean pxposed) {
        this.pxposed = pxposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}
