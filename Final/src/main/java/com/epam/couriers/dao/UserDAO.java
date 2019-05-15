package com.epam.couriers.dao;

import com.epam.couriers.entity.User;
import com.epam.couriers.dao.exception.DAOException;

import java.util.List;

public abstract class UserDAO extends BaseDAO<User>{


    /**
     * Get list of users
     *
     * This method get only:
     *      *               <br> - {@link User #id}
     *      *               <br> - {@link User #login}
     *      *               <br> - {@link User #password}
     *      *               <br> - {@link User #role}
     * @return  list of users
     * @throws DAOException if something went wrong
     */
    public abstract List<User> getAllUsers() throws DAOException;

    /**
     * Check if there is a user in the database. If he is, give all the information about him.
     * @param user
     * @return <code>User</code>
     * @throws DAOException if something went wrong
     */
    public abstract User authorization(User user) throws DAOException;


    /**
     * Inserts user into database
     *
     * @param user where must be set following properties:
     *      *               <br> - {@link User #name} of new user
     *      *               <br> - {@link User #login} of new user
     *      *               <br> - {@link User #password} of new user
     *      *               <br> - {@link User #role} of new user
     * @return {@link User} with all filled properties
     * @throws DAOException if something went wrong
     */
    @Override
    public abstract User insert(User user) throws DAOException;


    /**
     * Deletes the user with the specified id
     *
     * @param userId id of an entity to delete
     * @throws DAOException if something went wrong
     */
    @Override
    public abstract  void delete(int userId) throws DAOException;
}
