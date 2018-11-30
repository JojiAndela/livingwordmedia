package com.jojitoon.org.livingwordmedia

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

/**
 * A placeholder fragment containing a simple view.
 */
class FacebookFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_facebook, container, false)
        val myWebView: WebView = view.findViewById(R.id.facebook)
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("https://m.facebook.com/saintscommunity.net")
        return view
    }
}
