/**
 */
package experimentOntology.impl;

import experimentOntology.Experiment;
import experimentOntology.ExperimentOntologyPackage;
import experimentOntology.ExperimentalStudy;

import experimentOntology.description.Description;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimental Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.impl.ExperimentalStudyImpl#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link experimentOntology.impl.ExperimentalStudyImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentalStudyImpl extends MinimalEObjectImpl.Container implements ExperimentalStudy {
	/**
	 * The cached value of the '{@link #getExperiments() <em>Experiments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiments()
	 * @generated
	 * @ordered
	 */
	protected EList<Experiment> experiments;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentalStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentOntologyPackage.Literals.EXPERIMENTAL_STUDY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Experiment> getExperiments() {
		if (experiments == null) {
			experiments = new EObjectContainmentEList<Experiment>(Experiment.class, this, ExperimentOntologyPackage.EXPERIMENTAL_STUDY__EXPERIMENTS);
		}
		return experiments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__EXPERIMENTS:
				return ((InternalEList<?>)getExperiments()).basicRemove(otherEnd, msgs);
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__EXPERIMENTS:
				return getExperiments();
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__EXPERIMENTS:
				getExperiments().clear();
				getExperiments().addAll((Collection<? extends Experiment>)newValue);
				return;
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION:
				setDescription((Description)newValue);
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
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__EXPERIMENTS:
				getExperiments().clear();
				return;
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION:
				setDescription((Description)null);
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
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__EXPERIMENTS:
				return experiments != null && !experiments.isEmpty();
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //ExperimentalStudyImpl
