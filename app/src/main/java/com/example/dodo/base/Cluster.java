package com.example.dodo.base;import com.google.android.gms.maps.model.LatLng;import com.google.maps.android.clustering.ClusterItem;/** * Created by dodo on 11/06/16. */public class Cluster implements ClusterItem {    private final LatLng mPosition;    public Cluster(double lat, double lng) {        mPosition = new LatLng(lat, lng);    }    @Override    public LatLng getPosition() {        return mPosition;    }}