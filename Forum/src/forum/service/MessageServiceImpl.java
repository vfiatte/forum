/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.MessageDAO;
import forum.dao.MessageDAOjpaImpl;
import forum.entity.Message;
import forum.entity.Sujet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAOjpaImpl dao;

    public void ajouter(Message m) {
        dao.ajouter(m);
    }

    public void supprimer(long id) {
        dao.supprimer(id);
    }

    public List<Message> listerTous() {
        return dao.listerTous();
    }

    public Message rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

    public void modifier(Message m) {
        dao.modifier(m);
    }
}

