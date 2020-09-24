package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

/**
*UserBeanExample
* @author Shein Generator
* @since 2020/09/23
*/
public class UserBeanExample {
    /**
    *orderByClause
    */
    protected String orderByClause;

    /**
    *distinct
    */
    protected boolean distinct;

    /**
    *oredCriteria
    */
    protected List<Criteria> oredCriteria;

    /**
    *limit
    */
    private Integer limit;

    /**
    *offset
    */
    private Integer offset;

    /**
    * UserBeanExample
    */
    public UserBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
    * setOrderByClause
    * @param orderByClause orderByClause
    */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
    * getOrderByClause
    * @return String String
    */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
    * setDistinct
    * @param distinct distinct
    */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
    * isDistinct
    * @return boolean boolean
    */
    public boolean isDistinct() {
        return distinct;
    }

    /**
    * getOredCriteria
    * @return List<Criteria> List<Criteria>
    */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
    * or
    * @param criteria criteria
    */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
    * or
    * @return Criteria Criteria
    */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
    * createCriteria
    * @return Criteria Criteria
    */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
    * createCriteriaInternal
    * @return Criteria Criteria
    */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
    * clear
    */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
    * setLimit
    * @param limit limit
    */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
    * getLimit
    * @return Integer Integer
    */
    public Integer getLimit() {
        return limit;
    }

    /**
    * setOffset
    * @param offset offset
    */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
    * getOffset
    * @return Integer Integer
    */
    public Integer getOffset() {
        return offset;
    }

    /**
    * setPageInfo
    * @param currentPage currentPage
    * @param pageSize pageSize
    */
    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
    }

    /**
    *AbstractGeneratedCriteria
    * @author Shein Generator
    * @since 2020/09/23
    */
    protected abstract static class AbstractGeneratedCriteria {
        /**
        *criteria
        */
        protected List<Criterion> criteria;

        /**
        * AbstractGeneratedCriteria
        */
        protected AbstractGeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
        * isValid
        * @return boolean boolean
        */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
        * getAllCriteria
        * @return List<Criterion> List<Criterion>
        */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
        * getCriteria
        * @return List<Criterion> List<Criterion>
        */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
        * addCriterion
        * @param condition condition
        */
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
        * addCriterion
        * @param condition condition
        * @param value value
        * @param property property
        */
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
        * addCriterion
        * @param condition condition
        * @param value1 value1
        * @param value2 value2
        * @param property property
        */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
        * andIdIsNull
        * @return Criteria Criteria
        */
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        /**
        * andIdIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        /**
        * andIdEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        /**
        * andIdBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
        * andPasswordIsNull
        * @return Criteria Criteria
        */
        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        /**
        * andPasswordIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        /**
        * andPasswordEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordEqualTo(Integer value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordNotEqualTo(Integer value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordGreaterThan(Integer value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordLessThan(Integer value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordLessThanOrEqualTo(Integer value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andPasswordIn(List<Integer> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andPasswordNotIn(List<Integer> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andPasswordBetween(Integer value1, Integer value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andPasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }
    }

    /**
    *Criteria
    * @author Shein Generator
    * @since 2020/09/23
    */
    public static class Criteria extends AbstractGeneratedCriteria {

        /**
        * Criteria
        */
        protected Criteria() {
            super();
        }
    }

    /**
    *Criterion
    * @author Shein Generator
    * @since 2020/09/23
    */
    public static class Criterion {
        /**
        *condition
        */
        private String condition;

        /**
        *value
        */
        private Object value;

        /**
        *secondValue
        */
        private Object secondValue;

        /**
        *noValue
        */
        private boolean noValue;

        /**
        *singleValue
        */
        private boolean singleValue;

        /**
        *betweenValue
        */
        private boolean betweenValue;

        /**
        *listValue
        */
        private boolean listValue;

        /**
        *typeHandler
        */
        private String typeHandler;

        /**
        * getCondition
        * @return String String
        */
        public String getCondition() {
            return condition;
        }

        /**
        * getValue
        * @return Object Object
        */
        public Object getValue() {
            return value;
        }

        /**
        * getSecondValue
        * @return Object Object
        */
        public Object getSecondValue() {
            return secondValue;
        }

        /**
        * isNoValue
        * @return boolean boolean
        */
        public boolean isNoValue() {
            return noValue;
        }

        /**
        * isSingleValue
        * @return boolean boolean
        */
        public boolean isSingleValue() {
            return singleValue;
        }

        /**
        * isBetweenValue
        * @return boolean boolean
        */
        public boolean isBetweenValue() {
            return betweenValue;
        }

        /**
        * isListValue
        * @return boolean boolean
        */
        public boolean isListValue() {
            return listValue;
        }

        /**
        * getTypeHandler
        * @return String String
        */
        public String getTypeHandler() {
            return typeHandler;
        }

        /**
        * Criterion
        * @param condition condition
        */
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param typeHandler typeHandler
        */
        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        */
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param secondValue secondValue
        * @param typeHandler typeHandler
        */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param secondValue secondValue
        */
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}