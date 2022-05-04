package main.travel;

import main.person;

import java.util.ArrayList;

public interface travable {

    void add_travel(travel a);
    void arrange_travel();
    int travel_cost(ArrayList<person> passenger, String vehicle);
    void travel_history();
}
