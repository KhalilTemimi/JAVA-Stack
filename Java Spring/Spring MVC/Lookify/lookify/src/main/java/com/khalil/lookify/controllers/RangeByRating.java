package com.khalil.lookify.controllers;

import java.util.Comparator;

import com.khalil.lookify.models.PlayList;

public class RangeByRating implements Comparator<PlayList>{
	public int compare(PlayList a, PlayList b) {
		int compA = a.getRating()*10;
		int compB = b.getRating()*10;
		return compB-compA;
	}
}
