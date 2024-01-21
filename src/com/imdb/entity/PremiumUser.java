package com.imdb.entity;

import com.imdb.interfaces.PremiumUserFeatures;

public class PremiumUser extends User implements PremiumUserFeatures{
	public PremiumUser(String username) {
        super(username);
    }

	@Override
	public boolean CanWriteJournal() {
		return true;
	}

}
