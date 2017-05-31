package navdrawer.test.com.navigationdrawertest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        //List<String> menu3 = new ArrayList<String>();
        List<String> menu4 = new ArrayList<String>();

        List<String> list1 = new ArrayList<String>();
        list1.add("Dashboard");
        list1.add("Delivery");
        list1.add("Delivery Report");

        List<String> list2 = new ArrayList<String>();
        list2.add("Dashboard");
        list2.add("Delivery");
        list2.add("Delivery Report");

        List<String> list3 = new ArrayList<String>();
        list3.add("Home");
        list3.add("Trends");

        expandableListDetail.put("Pickup", list1);
        expandableListDetail.put("Shuttle", list2);
        expandableListDetail.put("Graph", list3);
        expandableListDetail.put("Logout", menu4);

        return expandableListDetail;
    }
}
