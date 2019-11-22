package com.sujanmaharjan008.esoftwarica.ui.usersList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sujanmaharjan008.esoftwarica.R;
import com.sujanmaharjan008.esoftwarica.adapter.UserAdapter;
import com.sujanmaharjan008.esoftwarica.model.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class UsersFragment extends Fragment {

    private RecyclerView recyclerView;
    String name, age, gender, address;
    int imageId;
    public static List<UserInfo> users = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_users, container, false);
        recyclerView = root.findViewById(R.id.recyclerView);

        if(users.size() == 0) {
            users.add(new UserInfo(R.drawable.male, "Male", "Bibek Dhami", "21", "Tikapur"));
            users.add(new UserInfo(R.drawable.female, "Female", "Sit Dhami", "21", "Tikapur"));
        }

        UserAdapter userAdapter = new UserAdapter(getActivity(), users);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }
}