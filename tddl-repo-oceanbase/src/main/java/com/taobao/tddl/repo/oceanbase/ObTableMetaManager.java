package com.taobao.tddl.repo.oceanbase;

import com.taobao.tddl.common.utils.extension.Activate;
import com.taobao.tddl.common.utils.logger.Logger;
import com.taobao.tddl.common.utils.logger.LoggerFactory;
import com.taobao.tddl.executor.spi.IDataSourceGetter;
import com.taobao.tddl.repo.mysql.MysqlTableMetaManager;
import com.taobao.tddl.repo.oceanbase.spi.ObDatasourceGetter;

/**
 * @author mengshi.sunmengshi 2013-12-5 下午6:18:14
 * @since 5.1.0
 */
@Activate(name = "OCEANBASE_JDBC", order = 2)
public class ObTableMetaManager extends MysqlTableMetaManager {

    private final static Logger     logger     = LoggerFactory.getLogger(ObTableMetaManager.class);
    private final IDataSourceGetter obDsGetter = new ObDatasourceGetter();

    @Override
    protected IDataSourceGetter getDatasourceGetter() {
        return this.obDsGetter;
    }

}
