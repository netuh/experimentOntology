/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.apparatus.NewPackage4Package;
import codingExperimentOntology.apparatus.Question;
import codingExperimentOntology.apparatus.QuestionContent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.impl.QuestionImpl#getEnunciation <em>Enunciation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The cached value of the '{@link #getEnunciation() <em>Enunciation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnunciation()
	 * @generated
	 * @ordered
	 */
	protected QuestionContent enunciation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage4Package.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionContent getEnunciation() {
		return enunciation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnunciation(QuestionContent newEnunciation, NotificationChain msgs) {
		QuestionContent oldEnunciation = enunciation;
		enunciation = newEnunciation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NewPackage4Package.QUESTION__ENUNCIATION, oldEnunciation, newEnunciation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnunciation(QuestionContent newEnunciation) {
		if (newEnunciation != enunciation) {
			NotificationChain msgs = null;
			if (enunciation != null)
				msgs = ((InternalEObject)enunciation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NewPackage4Package.QUESTION__ENUNCIATION, null, msgs);
			if (newEnunciation != null)
				msgs = ((InternalEObject)newEnunciation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NewPackage4Package.QUESTION__ENUNCIATION, null, msgs);
			msgs = basicSetEnunciation(newEnunciation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage4Package.QUESTION__ENUNCIATION, newEnunciation, newEnunciation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NewPackage4Package.QUESTION__ENUNCIATION:
				return basicSetEnunciation(null, msgs);
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
			case NewPackage4Package.QUESTION__ENUNCIATION:
				return getEnunciation();
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
			case NewPackage4Package.QUESTION__ENUNCIATION:
				setEnunciation((QuestionContent)newValue);
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
			case NewPackage4Package.QUESTION__ENUNCIATION:
				setEnunciation((QuestionContent)null);
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
			case NewPackage4Package.QUESTION__ENUNCIATION:
				return enunciation != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionImpl
