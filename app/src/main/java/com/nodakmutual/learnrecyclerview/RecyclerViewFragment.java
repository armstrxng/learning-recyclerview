package com.nodakmutual.learnrecyclerview;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerArtists;

    public RecyclerViewFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // This decides which layout the fragment will use.
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    // The view passed to us in this parameter contains all of the views we created in XML
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Map our view
        recyclerArtists = (RecyclerView) view.findViewById(R.id.recycler_artists);

        // Every RecyclerView needs a LayoutManager. Notice that it's an inner class.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        // Don't forget to set the manager on your RecyclerView!
        recyclerArtists.setLayoutManager(layoutManager);

        List<ArtistInfo> artists = artistList();

        recyclerArtists.setAdapter(new ArtistAdapter(artists));

    }

    private List<ArtistInfo> artistList() {
        // Creates a list of Contacts and fills them up with data
        List<ArtistInfo> artists = new ArrayList<>();
        artists.add(new ArtistInfo(R.drawable.ghostsep, "Crywolf", "Swimming in the Flood", "6", "2013", "Always Never Records"));
        artists.add(new ArtistInfo(R.drawable.krewella, "Krewella", "Human", "14", "2013", "Columbia Records"));
        artists.add(new ArtistInfo(R.drawable.vicetone,"Vicetone", "Heartbeat", "Single", "2013", "Monstercat"));
        artists.add(new ArtistInfo(R.drawable.smallpools, "Smallpools", "Dreaming", "Single", "2013", "RCA"));
        artists.add(new ArtistInfo(R.drawable.iconapop, "Icona Pop", "All Night", "11", "2013", "Ten/Atlantic Records"));
        artists.add(new ArtistInfo(R.drawable.tristam, "Tristam", "I Remember", "Single", "2012", "Monstercat"));
        artists.add(new ArtistInfo(R.drawable.mitis, "MitiS", "Born(Vocal Mix)", "6", "2013", "INTO THE AM Records"));
        artists.add(new ArtistInfo(R.drawable.sevenlions, "Seven Lions", "Days to Come", "6", "2013", "OWSLA"));
        artists.add(new ArtistInfo(R.drawable.tristamandbrakken, "Tristam & Brakken", "Frame of Mind", "Single", "2014", "Monstercat"));
        artists.add(new ArtistInfo(R.drawable.m83, "M83", "Midnight City", "22", "2011", "Naive Records/Mute Records" ));

        return artists;
    }
}
