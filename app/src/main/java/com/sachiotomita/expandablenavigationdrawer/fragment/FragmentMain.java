package com.sachiotomita.expandablenavigationdrawer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sachiotomita.expandablenavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentMain#newInstance_} factory method to
 * create an instance of this fragment.
 */
public class FragmentMain extends Fragment {

    private static final String KEY_MOVIE_TITLE = "key_title";

    public FragmentMain() {
        // Required empty public constructor
//        Bundle args = new Bundle();
//        args.putString(KEY_MOVIE_TITLE, title);
//        this.setArguments(args);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment FragmentAction.
     */
//    public static FragmentAction newInstance_(String movieTitle) {
//        FragmentAction fragmentAction = new FragmentAction();
//        Bundle args = new Bundle();
//        args.putString(KEY_MOVIE_TITLE, movieTitle);
//        fragmentAction.setArguments(args);
//
//        return fragmentAction;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Drawable movieIcon = ResourcesCompat.getDrawable(getResources(), R.drawable.movie_icon, getContext().getTheme());
//        if (movieIcon != null) {
//            movieIcon.setColorFilter(ContextCompat.getColor(getContext(), R.color.pink), PorterDuff.Mode.SRC_ATOP);
//        }
//        ((ImageView) view.findViewById(R.id.movie_icon)).setImageDrawable(movieIcon);
//
//        String movieTitle = getArguments().getString(KEY_MOVIE_TITLE);
//        ((TextView) view.findViewById(R.id.movie_title)).setText(movieTitle);
    }
}
