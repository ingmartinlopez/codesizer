/**
 * 
 */
package com.devgear.codesizer.template.service;

import org.springframework.stereotype.Service;

import com.devgear.codesizer.core.util.service.BaseService;
import com.devgear.codesizer.model.TemplateActivity;
import com.devgear.codesizer.template.dao.ITemplateActivityDao;

/**
 * @author mlopez
 *
 */
@Service("TemplateActivityService")
public class TemplateActivityServiceImpl extends BaseService<TemplateActivity, Integer, ITemplateActivityDao> implements ITemplateActivityService {


}
