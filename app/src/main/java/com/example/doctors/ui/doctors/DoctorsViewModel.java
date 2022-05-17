package com.example.doctors.ui.doctors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.doctors.R;
import com.example.doctors.models.Person;

import java.util.ArrayList;

public class DoctorsViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Person>> persons;
    private ArrayList<Person> doctorList;

    public void setList(ArrayList<Person> person) {
        doctorList = person;
        init();
    }

    public DoctorsViewModel() {
        persons = new MutableLiveData<>();
        init();
    }

    private void init(){
        populateList();
        persons.setValue(doctorList);
    }

    private void populateList(){
        doctorList = new ArrayList<>();
        doctorList.add(new Person("Doctor who", 209, "Family physician", R.drawable.img1));
        doctorList.add(new Person("Doctor Strange", 11, "Neurologists", R.drawable.img2));
        doctorList.add(new Person("Lexy Grey", 11, "Resident Surgeon", R.drawable.img3));
        doctorList.add(new Person("Doctor who", 209, "Family physician", R.drawable.img1));
        doctorList.add(new Person("Doctor Strange", 11, "Neurologists", R.drawable.img2));
        doctorList.add(new Person("Lexy Grey", 11, "Resident Surgeon", R.drawable.img3));
        doctorList.add(new Person("Doctor who", 209, "Family physician", R.drawable.img1));
        doctorList.add(new Person("Doctor Strange", 11, "Neurologists", R.drawable.img2));
        doctorList.add(new Person("Lexy Grey", 11, "Resident Surgeon", R.drawable.img3));

    }

    public LiveData<ArrayList<Person>> getMutableLiveData() {
        return persons;
    }
}