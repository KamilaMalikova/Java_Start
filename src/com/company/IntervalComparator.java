package com.company;

import java.util.Comparator;

public class IntervalComparator implements Comparator<Interval> {

    public int compare(Interval i1, Interval i2)
    {
        return i1.start - i2.end;
    }
}
