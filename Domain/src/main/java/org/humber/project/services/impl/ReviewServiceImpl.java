package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Review;
import org.humber.project.services.ReviewService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService
{
    @Override
    public List<Review> getAllReviews(String movie_id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllReviews'");
    }

    @Override
    public void updateReview(Review review) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateReview'");
    }

    @Override
    public void addReview(Review review) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addReview'");
    }

    @Override
    public void deleteReview(Review review) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteReview'");
    }
}
