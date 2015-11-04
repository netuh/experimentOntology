/**
 */
package experimentOntology.description.gqm.impl;

import experimentOntology.description.gqm.GQMDescription;
import experimentOntology.description.gqm.Goals;
import experimentOntology.description.gqm.GqmPackage;
import experimentOntology.description.gqm.Metrics;
import experimentOntology.description.gqm.Questions;

import experimentOntology.description.impl.DescribableImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GQM Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.impl.GQMDescriptionImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link experimentOntology.description.gqm.impl.GQMDescriptionImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link experimentOntology.description.gqm.impl.GQMDescriptionImpl#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GQMDescriptionImpl extends DescribableImpl implements GQMDescription {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected Goals goals;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected Questions questions;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected Metrics metrics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GQMDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqmPackage.Literals.GQM_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goals getGoals() {
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoals(Goals newGoals, NotificationChain msgs) {
		Goals oldGoals = goals;
		goals = newGoals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqmPackage.GQM_DESCRIPTION__GOALS, oldGoals, newGoals);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals(Goals newGoals) {
		if (newGoals != goals) {
			NotificationChain msgs = null;
			if (goals != null)
				msgs = ((InternalEObject)goals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GqmPackage.GQM_DESCRIPTION__GOALS, null, msgs);
			if (newGoals != null)
				msgs = ((InternalEObject)newGoals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GqmPackage.GQM_DESCRIPTION__GOALS, null, msgs);
			msgs = basicSetGoals(newGoals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqmPackage.GQM_DESCRIPTION__GOALS, newGoals, newGoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questions getQuestions() {
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestions(Questions newQuestions, NotificationChain msgs) {
		Questions oldQuestions = questions;
		questions = newQuestions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqmPackage.GQM_DESCRIPTION__QUESTIONS, oldQuestions, newQuestions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestions(Questions newQuestions) {
		if (newQuestions != questions) {
			NotificationChain msgs = null;
			if (questions != null)
				msgs = ((InternalEObject)questions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GqmPackage.GQM_DESCRIPTION__QUESTIONS, null, msgs);
			if (newQuestions != null)
				msgs = ((InternalEObject)newQuestions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GqmPackage.GQM_DESCRIPTION__QUESTIONS, null, msgs);
			msgs = basicSetQuestions(newQuestions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqmPackage.GQM_DESCRIPTION__QUESTIONS, newQuestions, newQuestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrics getMetrics() {
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetrics(Metrics newMetrics, NotificationChain msgs) {
		Metrics oldMetrics = metrics;
		metrics = newMetrics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqmPackage.GQM_DESCRIPTION__METRICS, oldMetrics, newMetrics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrics(Metrics newMetrics) {
		if (newMetrics != metrics) {
			NotificationChain msgs = null;
			if (metrics != null)
				msgs = ((InternalEObject)metrics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GqmPackage.GQM_DESCRIPTION__METRICS, null, msgs);
			if (newMetrics != null)
				msgs = ((InternalEObject)newMetrics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GqmPackage.GQM_DESCRIPTION__METRICS, null, msgs);
			msgs = basicSetMetrics(newMetrics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqmPackage.GQM_DESCRIPTION__METRICS, newMetrics, newMetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GqmPackage.GQM_DESCRIPTION__GOALS:
				return basicSetGoals(null, msgs);
			case GqmPackage.GQM_DESCRIPTION__QUESTIONS:
				return basicSetQuestions(null, msgs);
			case GqmPackage.GQM_DESCRIPTION__METRICS:
				return basicSetMetrics(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqmPackage.GQM_DESCRIPTION__GOALS:
				return getGoals();
			case GqmPackage.GQM_DESCRIPTION__QUESTIONS:
				return getQuestions();
			case GqmPackage.GQM_DESCRIPTION__METRICS:
				return getMetrics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GqmPackage.GQM_DESCRIPTION__GOALS:
				setGoals((Goals)newValue);
				return;
			case GqmPackage.GQM_DESCRIPTION__QUESTIONS:
				setQuestions((Questions)newValue);
				return;
			case GqmPackage.GQM_DESCRIPTION__METRICS:
				setMetrics((Metrics)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GqmPackage.GQM_DESCRIPTION__GOALS:
				setGoals((Goals)null);
				return;
			case GqmPackage.GQM_DESCRIPTION__QUESTIONS:
				setQuestions((Questions)null);
				return;
			case GqmPackage.GQM_DESCRIPTION__METRICS:
				setMetrics((Metrics)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GqmPackage.GQM_DESCRIPTION__GOALS:
				return goals != null;
			case GqmPackage.GQM_DESCRIPTION__QUESTIONS:
				return questions != null;
			case GqmPackage.GQM_DESCRIPTION__METRICS:
				return metrics != null;
		}
		return super.eIsSet(featureID);
	}

} //GQMDescriptionImpl
