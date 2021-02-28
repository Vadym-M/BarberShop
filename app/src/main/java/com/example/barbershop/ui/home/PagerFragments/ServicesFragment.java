package com.example.barbershop.ui.home.PagerFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.barbershop.R;
import com.example.barbershop.Service;
import com.example.barbershop.ui.home.adapters.AdapterServices;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ServicesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServicesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ServicesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ServicesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ServicesFragment newInstance(String param1, String param2) {
        ServicesFragment fragment = new ServicesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_services, container, false);
        ArrayList<Service> services = new ArrayList<>();
        services.add(new Service("COMBO","Tworzenie Ikony Stylu", "90.00 zl"));
        services.add(new Service("HAIRCUT","Tworzenie Ikony Stylu", "60.00 zl"));
        services.add(new Service("BEARD","Tworzenie Ikony Stylu", "40.00 zl"));
        services.add(new Service("SPA","Parowanie, Pilling, Glinka, Platki pod oczy, Regulacja brwi ", "50.00 zl"));
        services.add(new Service("MILITARY CUT","Strzyrzenie na jedną dlugość", "40.00 zl"));
        services.add(new Service("Przyciemnienie Brody","", "40.00 zl"));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerService);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(view.getContext(),1);
        recyclerView.setLayoutManager(layoutManager);
        AdapterServices adapterServices = new AdapterServices(view.getContext(), services);
        recyclerView.setAdapter(adapterServices);

        return  view;
    }
}