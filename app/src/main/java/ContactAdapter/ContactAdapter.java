package ContactAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler3.R;

import java.util.ArrayList;

import contactModel.ContactModel;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    ArrayList<ContactModel> list1;


    public ContactAdapter(ArrayList<ContactModel> list1) {
        this.list1 = list1;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContactModel userlist = list1.get(position);
        holder.pic.setImageResource(userlist.getPic());
        holder.name.setText(userlist.getName());
        holder.number.setText(userlist.getNumber());

    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pic;
        TextView name, number;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pic=itemView.findViewById(R.id.image1);
            name=itemView.findViewById(R.id.text1);
            number=itemView.findViewById(R.id.text2);

        }
    }
}
