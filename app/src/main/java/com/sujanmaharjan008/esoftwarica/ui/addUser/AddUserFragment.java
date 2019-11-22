package com.sujanmaharjan008.esoftwarica.ui.addUser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.sujanmaharjan008.esoftwarica.R;
import com.sujanmaharjan008.esoftwarica.model.UserInfo;
import com.sujanmaharjan008.esoftwarica.ui.usersList.UsersFragment;

public class AddUserFragment extends Fragment implements View.OnClickListener {
    private EditText edtName, edtAge, edtAddress;
    private Button btnSave;
    private RadioGroup rdgGender;
    String name, age, gender, address;
    int imageId;
//    final List<UserInfo> userList = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_add_user, container, false);
        edtAddress = root.findViewById(R.id.edtAddress);
        edtName = root.findViewById(R.id.edtName);
        edtAge = root.findViewById(R.id.edtAge);
        btnSave = root.findViewById(R.id.btnSave);
        rdgGender = root.findViewById(R.id.rdgGender);

        btnSave.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        name = edtName.getText().toString();
        age = edtAge.getText().toString();
        address = edtAddress.getText().toString();

        int selectedId = rdgGender.getCheckedRadioButtonId();
        if (selectedId == R.id.rdbMale) {
            gender = "Male";
            imageId = R.drawable.male;
        } else if (selectedId == R.id.rdbFemale) {
            gender = "Female";
            imageId = R.drawable.female;
        } else if (selectedId == R.id.rdbOthers) {
            gender = "Others";
            imageId = R.drawable.ic_notifications_black_24dp;
        }

        UsersFragment.users.add(new UserInfo(imageId, gender, name, age, address));

        Toast.makeText(getActivity(), "User data inserted", Toast.LENGTH_SHORT).show();
    }
}