package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancingproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancingproductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRiskIsNull() {
            addCriterion("risk is null");
            return (Criteria) this;
        }

        public Criteria andRiskIsNotNull() {
            addCriterion("risk is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEqualTo(Long value) {
            addCriterion("risk =", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotEqualTo(Long value) {
            addCriterion("risk <>", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThan(Long value) {
            addCriterion("risk >", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThanOrEqualTo(Long value) {
            addCriterion("risk >=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThan(Long value) {
            addCriterion("risk <", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThanOrEqualTo(Long value) {
            addCriterion("risk <=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskIn(List<Long> values) {
            addCriterion("risk in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotIn(List<Long> values) {
            addCriterion("risk not in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskBetween(Long value1, Long value2) {
            addCriterion("risk between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotBetween(Long value1, Long value2) {
            addCriterion("risk not between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("income like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("income not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andSalestartingIsNull() {
            addCriterion("salestarting is null");
            return (Criteria) this;
        }

        public Criteria andSalestartingIsNotNull() {
            addCriterion("salestarting is not null");
            return (Criteria) this;
        }

        public Criteria andSalestartingEqualTo(Date value) {
            addCriterion("salestarting =", value, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingNotEqualTo(Date value) {
            addCriterion("salestarting <>", value, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingGreaterThan(Date value) {
            addCriterion("salestarting >", value, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingGreaterThanOrEqualTo(Date value) {
            addCriterion("salestarting >=", value, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingLessThan(Date value) {
            addCriterion("salestarting <", value, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingLessThanOrEqualTo(Date value) {
            addCriterion("salestarting <=", value, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingIn(List<Date> values) {
            addCriterion("salestarting in", values, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingNotIn(List<Date> values) {
            addCriterion("salestarting not in", values, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingBetween(Date value1, Date value2) {
            addCriterion("salestarting between", value1, value2, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSalestartingNotBetween(Date value1, Date value2) {
            addCriterion("salestarting not between", value1, value2, "salestarting");
            return (Criteria) this;
        }

        public Criteria andSaleendIsNull() {
            addCriterion("saleend is null");
            return (Criteria) this;
        }

        public Criteria andSaleendIsNotNull() {
            addCriterion("saleend is not null");
            return (Criteria) this;
        }

        public Criteria andSaleendEqualTo(Date value) {
            addCriterion("saleend =", value, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendNotEqualTo(Date value) {
            addCriterion("saleend <>", value, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendGreaterThan(Date value) {
            addCriterion("saleend >", value, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendGreaterThanOrEqualTo(Date value) {
            addCriterion("saleend >=", value, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendLessThan(Date value) {
            addCriterion("saleend <", value, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendLessThanOrEqualTo(Date value) {
            addCriterion("saleend <=", value, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendIn(List<Date> values) {
            addCriterion("saleend in", values, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendNotIn(List<Date> values) {
            addCriterion("saleend not in", values, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendBetween(Date value1, Date value2) {
            addCriterion("saleend between", value1, value2, "saleend");
            return (Criteria) this;
        }

        public Criteria andSaleendNotBetween(Date value1, Date value2) {
            addCriterion("saleend not between", value1, value2, "saleend");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("end is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("end is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(Date value) {
            addCriterion("end =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(Date value) {
            addCriterion("end <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(Date value) {
            addCriterion("end >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(Date value) {
            addCriterion("end >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(Date value) {
            addCriterion("end <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(Date value) {
            addCriterion("end <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<Date> values) {
            addCriterion("end in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<Date> values) {
            addCriterion("end not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(Date value1, Date value2) {
            addCriterion("end between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(Date value1, Date value2) {
            addCriterion("end not between", value1, value2, "end");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

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

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}