package cn.xjtu.zun.tiesheyuan.entity;

import java.util.Currency;

/**
 * 分页内容
 */
public class Page {
//    当前页面
    private int curPage = 1;
//    单页上限
    private int limit = 10;
//    数据总数
    private long rows;
//    查询路径（用于复用分页链接）
    private String path;

//

    public int getCurPage() {
        return curPage;
    }

    public int getLimit() {
        return limit;
    }

    public long getRows() {
        return rows;
    }

    public String getPath() {
        return path;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public void setLimit(int limit) {
        if (limit > 1 && limit <=100){
            this.limit = limit;
        }
    }

    public void setRows(long rows) {
        if(rows >= 0){
            this.rows = rows;
        }
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页起始行
     * @return 起始行
     */
    public int getOffset(){
        return (this.curPage - 1) * limit;
    }

    /**
     * 获取总页数
     * @return
     */
    public long getTotal(){
        if (rows % limit == 0){
            return rows / limit;
        }
        return rows / limit + 1;
    }

    /**
     * 获取起始
     * @return
     */
    public int getFrom(){
        int from = curPage - 2;
        return Math.max(from, 1);
    }

    public int getTo(){
        long to = curPage + 2;
        long total = getTotal();
        return (int) Math.min(to, total);
    }
}
