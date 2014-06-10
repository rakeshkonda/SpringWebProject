package com.rakeshkonda.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListUtil {

    /**
     * splits a list into a list of sublists, each a maximum of the input size.
     * @param input
     * @param size
     * @return
     */
    public static List<List> splitList(List input, int size) {
        int start = 0;
        int end = size;

        List<List> outputList = new ArrayList<List>();
        while (end < input.size()) {
            outputList.add(input.subList(start, end));
            start = end;
            end = end + size;
        }

        // Do final Elements
        outputList.add(input.subList(start, input.size()));
        return outputList;

    }

    public static <T> List<List<T>> chopped(List<T> list, final int L) {
        List<List<T>> parts = new ArrayList<List<T>>();
        final int N = list.size();
        for (int i = 0; i < N; i += L) {
            parts.add(new ArrayList<T>(
                    list.subList(i, Math.min(N, i + L)))
            );
        }
        return parts;
    }

    public static <T> List<T> mergeLists(Collection<List<T>> inputList){
        List<T> list = new ArrayList<T>();
        for(Collection<T> input : inputList){
            list.addAll(input);
        }
        return list;
    }

}
