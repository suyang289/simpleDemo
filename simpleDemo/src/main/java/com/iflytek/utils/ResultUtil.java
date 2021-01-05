package com.iflytek.utils;

import java.util.HashMap;
import java.util.Map;

public class ResultUtil extends HashMap<String, Object> {

    public ResultUtil() {
        put("code", 0);
    }

    public static ResultUtil error() {
        return error(500, "δ֪�쳣������ϵ����Ա");
    }

    public static ResultUtil error(String msg) {
        return error(500, msg);
    }

    public static ResultUtil error(int code, String msg) {
        ResultUtil r = new ResultUtil();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ResultUtil ok(String msg) {
        ResultUtil r = new ResultUtil();
        r.put("msg", msg);
        return r;
    }

    public static ResultUtil ok(Map<String, Object> map) {
        ResultUtil r = new ResultUtil();
        r.putAll(map);
        return r;
    }


    public static ResultUtil ok(Object data) {
        ResultUtil r = new ResultUtil();
        r.put("data", data);
        return r;
    }


    public static ResultUtil ok(Object data, String msg) {
        ResultUtil r = new ResultUtil();
        r.put("data", data);
        r.put("msg", msg);
        return r;
    }

    public static ResultUtil ok() {
        return new ResultUtil();
    }

    @Override
    public ResultUtil put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
 