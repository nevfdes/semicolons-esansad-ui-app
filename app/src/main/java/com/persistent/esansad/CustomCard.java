package com.persistent.esansad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import it.gmariotti.cardslib.library.internal.Card;

/**
 * Created by ashwin_valento on 03-Feb-15.
 */
public class CustomCard extends Card{

    private Context context;
    protected TextView description;
    protected ImageButton thumbsUp;
    protected ImageButton thumbsDown;

    /**
     * Constructor with a custom inner layout
     * @param context is the context
     */
    public CustomCard(Context context) {
        this(context, R.layout.proposals_card_layout);
        this.context = context;
    }

    /**
     *
     * @param context is the context
     * @param innerLayout is the inner layout
     */
    public CustomCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    /**
     * Init
     */
    private void init(){

        //No Header

        //Set a OnClickListener listener
        setOnClickListener(new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(getContext(), "Click Listener card=", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        //Retrieve elements
        description = (TextView) parent.findViewById(R.id.tvDescription);
        thumbsUp = (ImageButton) parent.findViewById(R.id.btnVoteUp);
        thumbsDown = (ImageButton) parent.findViewById(R.id.btnVoteDown);


        if (description !=null)
            description.setText("This is the description");

        thumbsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Thumbs Up clicked",Toast.LENGTH_LONG).show();
            }
        });

        thumbsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Thumbs Down clicked",Toast.LENGTH_LONG).show();
            }
        });

    }
}