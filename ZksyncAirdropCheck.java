import cn.hutool.core.io.FileUtil;

import java.util.*;

public class ZksyncAirdropCheck {
    public static void main(String[] args) {
        List<Data> dataList = new ArrayList<>();
        for (String s: list) {
            Data check = check(s);
            if (null != check) {
                dataList.add(check);
            }
        }
        dataList.sort(Comparator.comparing(Data::getNum).reversed());
        for (int i = 0; i < 100; i++) {
            System.out.printf("%s: %d%n", dataList.get(i).getAddress(), dataList.get(i).getNum());
        }
    }

    private static List<String> list = new ArrayList<>();
    private static Map<String, Integer> map = new HashMap<>();

    @lombok.Data
    static class Data {
        private String address;
        private Integer num;
    }

    static {
        List<String> lines = FileUtil.readUtf8Lines("path to your provisionalSybilList.csv");
        for(String s : lines) {
            if (s.contains("0x")) {
                String substring = s.substring(s.indexOf("0x"));
                list.add(substring);
            }
        }

        List<String> zksLines = FileUtil.readUtf8Lines("path to your zks_eligibility_list.csv");
        for(String s : zksLines) {
            if (s.contains("0x")) {
                String[] split = s.split(",");
                map.put(split[0], Integer.parseInt(split[1]));
            }
        }
    }

    private static Data check(String address) {
        if (map.containsKey(address)) {
            //System.out.printf("%s:%d%n", address, map.get(address));
            Data d = new Data();
            d.num = map.get(address);
            d.address = address;
            return d;
        }
        return null;
    }
}
