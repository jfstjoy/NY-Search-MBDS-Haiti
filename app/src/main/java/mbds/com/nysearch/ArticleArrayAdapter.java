package mbds.com.nysearch;

import com.squareup.picasso.Picasso;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joel Felix St Joy on 02/16/18.
 */

public class ArticleArrayAdapter extends ArrayAdapter<Article> {

    public ArticleArrayAdapter(Context context, List<Article> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Article article = this.getItem(position);

        if (convertView == null) {
            LayoutInflater inflator = LayoutInflater.from(getContext());
            convertView = inflator.inflate(R.layout.item_image_result2, parent, false);
        }
        ImageView ivImage = (ImageView) convertView.findViewById(R.id.ivImage);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        tvTitle.setText(article.getHeadline());

        String thumbNail = article.getThumbnail();
        if (!TextUtils.isEmpty(thumbNail)) {
            Picasso.with(getContext()).load(thumbNail).fit().into(ivImage);
        } else {
            ivImage.setImageBitmap(null);
        }


        return convertView;
    }
}
