package android.com.varanasiproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class homeFragment extends Fragment {
    SliderLayout sliderLayout;
    List<Product> productList;

    RecyclerView recyclerView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Home");
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        sliderLayout = v.findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        productList = new ArrayList<>();

        productList.add(
                new Product(
                        1,
                        "lakhnaiya hills & waterfall",
                        "latifpur india",
                        4.3,
                        R.drawable.lake));

        productList.add(
                new Product(
                        2,
                        "sarnath mesum",
                        "archaeological suvey ogf india",
                        4.3,
                        R.drawable.mesum));
        productList.add(
                new Product(
                        3,"Assi ghat",
                        "ghat center of attraction is arati",
                        4.5,
           R.drawable.var1 ));
        productList.add(
                new Product(4,
                        "dasasumadha ghat",
                        "main ghat for traveller",
                        4.5,R.drawable.var2)
        );
        productList.add(
                new Product(5,
                        "manikarnika ghta",
                        "here soul of man reach warg",
                        4.5,R.drawable.var3)
        );
        productList.add(
                new Product(6,
                        "banars hindu university",
                        "india top 5 most prestigiuos university",
                        4.9,R.drawable.bhu)
        );
        productList.add(
                new Product(7,
                        "ramanager fort",
                        "place for king of varnsi",
                        4.5,R.drawable.ramnagar)
        );



        productAdapter adapter = new productAdapter(getContext(), productList);

        recyclerView.setAdapter(adapter);

return v;
    }

    private void setSliderViews() {

        for (int i = 0; i <=10; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.var1);
                    sliderView.setDescription("assi ghat");
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.var2);
                    sliderView.setDescription("manikanika ghat");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.var3);
                    sliderView.setDescription("dasasumadha ghat");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.var4);
                    sliderView.setDescription("parvati ghat");
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.bhu);
                    sliderView.setDescription("Banars hindu university");
                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.tulsi);
                    sliderView.setDescription("Tulsi manas mandir");
                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.lake);
                    sliderView.setDescription("lakaniya dari waterfall");
                    break;
                case 7:
                    sliderView.setImageDrawable(R.drawable.mesum);
                    sliderView.setDescription("sarnath meseum");
                    break;
                case 8:
                    sliderView.setImageDrawable(R.drawable.ramnagar);
                    sliderView.setDescription("ramanagar fort");
                    break;
                case 9:
                    sliderView.setImageDrawable(R.drawable.sankat);
                    sliderView.setDescription("sankat mochan mandir");
                    break;

                case 10:
                    sliderView.setImageDrawable(R.drawable.sarnath);
                    sliderView.setDescription("sarnath stupta");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(getContext(),"This is slider " + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });


            sliderLayout.addSliderView(sliderView);
        }
    }
}
