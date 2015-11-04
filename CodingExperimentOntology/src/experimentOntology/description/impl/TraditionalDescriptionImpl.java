/**
 */
package experimentOntology.description.impl;

import experimentOntology.description.DescriptionPackage;
import experimentOntology.description.Goals;
import experimentOntology.description.Questions;
import experimentOntology.description.ResearchHypotheses;
import experimentOntology.description.TraditionalDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traditional Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.impl.TraditionalDescriptionImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link experimentOntology.description.impl.TraditionalDescriptionImpl#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link experimentOntology.description.impl.TraditionalDescriptionImpl#getGoals <em>Goals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraditionalDescriptionImpl extends DescribableImpl implements TraditionalDescription {
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
	 * The cached value of the '{@link #getHypothesis() <em>Hypothesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypothesis()
	 * @generated
	 * @ordered
	 */
	protected ResearchHypotheses hypothesis;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraditionalDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.TRADITIONAL_DESCRIPTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS, oldQuestions, newQuestions);
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
				msgs = ((InternalEObject)questions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS, null, msgs);
			if (newQuestions != null)
				msgs = ((InternalEObject)newQuestions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS, null, msgs);
			msgs = basicSetQuestions(newQuestions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS, newQuestions, newQuestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchHypotheses getHypothesis() {
		return hypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHypothesis(ResearchHypotheses newHypothesis, NotificationChain msgs) {
		ResearchHypotheses oldHypothesis = hypothesis;
		hypothesis = newHypothesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS, oldHypothesis, newHypothesis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypothesis(ResearchHypotheses newHypothesis) {
		if (newHypothesis != hypothesis) {
			NotificationChain msgs = null;
			if (hypothesis != null)
				msgs = ((InternalEObject)hypothesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS, null, msgs);
			if (newHypothesis != null)
				msgs = ((InternalEObject)newHypothesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS, null, msgs);
			msgs = basicSetHypothesis(newHypothesis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS, newHypothesis, newHypothesis));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS, oldGoals, newGoals);
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
				msgs = ((InternalEObject)goals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS, null, msgs);
			if (newGoals != null)
				msgs = ((InternalEObject)newGoals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS, null, msgs);
			msgs = basicSetGoals(newGoals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS, newGoals, newGoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS:
				return basicSetQuestions(null, msgs);
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS:
				return basicSetHypothesis(null, msgs);
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS:
				return basicSetGoals(null, msgs);
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
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS:
				return getQuestions();
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS:
				return getHypothesis();
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS:
				return getGoals();
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
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS:
				setQuestions((Questions)newValue);
				return;
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS:
				setHypothesis((ResearchHypotheses)newValue);
				return;
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS:
				setGoals((Goals)newValue);
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
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS:
				setQuestions((Questions)null);
				return;
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS:
				setHypothesis((ResearchHypotheses)null);
				return;
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS:
				setGoals((Goals)null);
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
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__QUESTIONS:
				return questions != null;
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__HYPOTHESIS:
				return hypothesis != null;
			case DescriptionPackage.TRADITIONAL_DESCRIPTION__GOALS:
				return goals != null;
		}
		return super.eIsSet(featureID);
	}

} //TraditionalDescriptionImpl
