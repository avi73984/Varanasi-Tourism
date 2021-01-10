package android.com.varanasiproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class eventsFragment extends Fragment {
    List<tourism> firstplace;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_events,container,false);
        firstplace=new ArrayList<>();
        firstplace.add(new tourism("holi celebration","event celebration","holi is a festival of color celebrated all acrross the country",R.drawable.holi,2/03/2019));
        firstplace.add(new tourism("ram navmi","event celebration","this is celebrated due to birth of god ram",R.drawable.ram,14/04/2019));
        firstplace.add(new tourism("bhudha purnima","event celebration","this is celebrated due to birth of bhudha ",R.drawable.budha,12/05/2019));
        firstplace.add(new tourism("vaishaki","event celebration","this is celebrated on cuting of the first crop",R.drawable.vaishaki,14/04/2019));
        firstplace.add(new tourism("yoga","event celebration","this is perform due to yoga ",R.drawable.yoga,21/06/2019));
        firstplace.add(new tourism("rath yatra ","event celebration","this is celebrated due to vishnu awatar",R.drawable.rathyatra,4/07/2019));
        firstplace.add(new tourism("makar sankranti","event celebration","this is celebrated due to time of cutting first crop",R.drawable.patang,15/01/2019));
        firstplace.add(new tourism("maha shivratri  ","event celebration","this is celebrated due to lord shiv celebration",R.drawable.shivratri,20/01/2019));
        firstplace.add(new tourism("dev depawli","event celebration","this is celebrated on lord shiv birth day",R.drawable.dev,12/04/2019));
        firstplace.add(new tourism("ganga dusshera ","event celebration","this is celebrated for bathing in gange river",R.drawable.gangadishera,20/05/2019));
        RecyclerView myrv=(RecyclerView)v.findViewById(R.id.recyclerView);
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(getContext(),firstplace);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),4));
        myrv.setAdapter(myAdapter);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Events");
    }
}
