/**
 */
package experimentOntology.planning.impl;

import experimentOntology.planning.DependentVariables;
import experimentOntology.planning.ExperimentalPlan;
import experimentOntology.planning.IndependentVariables;
import experimentOntology.planning.PiecesOfApparatus;
import experimentOntology.planning.PlanningPackage;

import experimentOntology.planning.sampling.SamplingStrategy;

import experimentOntology.planning.threats.Threats;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimental Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.impl.ExperimentalPlanImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link experimentOntology.planning.impl.ExperimentalPlanImpl#getSamplingstrategy <em>Samplingstrategy</em>}</li>
 *   <li>{@link experimentOntology.planning.impl.ExperimentalPlanImpl#getApparatus <em>Apparatus</em>}</li>
 *   <li>{@link experimentOntology.planning.impl.ExperimentalPlanImpl#getDependentVariables <em>Dependent Variables</em>}</li>
 *   <li>{@link experimentOntology.planning.impl.ExperimentalPlanImpl#getIndependentvariables <em>Independentvariables</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExperimentalPlanImpl extends MinimalEObjectImpl.Container implements ExperimentalPlan {
	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected Threats threats;

	/**
	 * The cached value of the '{@link #getSamplingstrategy() <em>Samplingstrategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingstrategy()
	 * @generated
	 * @ordered
	 */
	protected SamplingStrategy samplingstrategy;

	/**
	 * The cached value of the '{@link #getApparatus() <em>Apparatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparatus()
	 * @generated
	 * @ordered
	 */
	protected PiecesOfApparatus apparatus;

	/**
	 * The cached value of the '{@link #getDependentVariables() <em>Dependent Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentVariables()
	 * @generated
	 * @ordered
	 */
	protected DependentVariables dependentVariables;

	/**
	 * The cached value of the '{@link #getIndependentvariables() <em>Independentvariables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentvariables()
	 * @generated
	 * @ordered
	 */
	protected IndependentVariables independentvariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentalPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanningPackage.Literals.EXPERIMENTAL_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threats getThreats() {
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreats(Threats newThreats, NotificationChain msgs) {
		Threats oldThreats = threats;
		threats = newThreats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__THREATS, oldThreats, newThreats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreats(Threats newThreats) {
		if (newThreats != threats) {
			NotificationChain msgs = null;
			if (threats != null)
				msgs = ((InternalEObject)threats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__THREATS, null, msgs);
			if (newThreats != null)
				msgs = ((InternalEObject)newThreats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__THREATS, null, msgs);
			msgs = basicSetThreats(newThreats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__THREATS, newThreats, newThreats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingStrategy getSamplingstrategy() {
		return samplingstrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamplingstrategy(SamplingStrategy newSamplingstrategy, NotificationChain msgs) {
		SamplingStrategy oldSamplingstrategy = samplingstrategy;
		samplingstrategy = newSamplingstrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY, oldSamplingstrategy, newSamplingstrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingstrategy(SamplingStrategy newSamplingstrategy) {
		if (newSamplingstrategy != samplingstrategy) {
			NotificationChain msgs = null;
			if (samplingstrategy != null)
				msgs = ((InternalEObject)samplingstrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY, null, msgs);
			if (newSamplingstrategy != null)
				msgs = ((InternalEObject)newSamplingstrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY, null, msgs);
			msgs = basicSetSamplingstrategy(newSamplingstrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY, newSamplingstrategy, newSamplingstrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiecesOfApparatus getApparatus() {
		return apparatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApparatus(PiecesOfApparatus newApparatus, NotificationChain msgs) {
		PiecesOfApparatus oldApparatus = apparatus;
		apparatus = newApparatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS, oldApparatus, newApparatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparatus(PiecesOfApparatus newApparatus) {
		if (newApparatus != apparatus) {
			NotificationChain msgs = null;
			if (apparatus != null)
				msgs = ((InternalEObject)apparatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS, null, msgs);
			if (newApparatus != null)
				msgs = ((InternalEObject)newApparatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS, null, msgs);
			msgs = basicSetApparatus(newApparatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS, newApparatus, newApparatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentVariables getDependentVariables() {
		return dependentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependentVariables(DependentVariables newDependentVariables, NotificationChain msgs) {
		DependentVariables oldDependentVariables = dependentVariables;
		dependentVariables = newDependentVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES, oldDependentVariables, newDependentVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentVariables(DependentVariables newDependentVariables) {
		if (newDependentVariables != dependentVariables) {
			NotificationChain msgs = null;
			if (dependentVariables != null)
				msgs = ((InternalEObject)dependentVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES, null, msgs);
			if (newDependentVariables != null)
				msgs = ((InternalEObject)newDependentVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES, null, msgs);
			msgs = basicSetDependentVariables(newDependentVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES, newDependentVariables, newDependentVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndependentVariables getIndependentvariables() {
		return independentvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndependentvariables(IndependentVariables newIndependentvariables, NotificationChain msgs) {
		IndependentVariables oldIndependentvariables = independentvariables;
		independentvariables = newIndependentvariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES, oldIndependentvariables, newIndependentvariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndependentvariables(IndependentVariables newIndependentvariables) {
		if (newIndependentvariables != independentvariables) {
			NotificationChain msgs = null;
			if (independentvariables != null)
				msgs = ((InternalEObject)independentvariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES, null, msgs);
			if (newIndependentvariables != null)
				msgs = ((InternalEObject)newIndependentvariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES, null, msgs);
			msgs = basicSetIndependentvariables(newIndependentvariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES, newIndependentvariables, newIndependentvariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanningPackage.EXPERIMENTAL_PLAN__THREATS:
				return basicSetThreats(null, msgs);
			case PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY:
				return basicSetSamplingstrategy(null, msgs);
			case PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS:
				return basicSetApparatus(null, msgs);
			case PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES:
				return basicSetDependentVariables(null, msgs);
			case PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES:
				return basicSetIndependentvariables(null, msgs);
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
			case PlanningPackage.EXPERIMENTAL_PLAN__THREATS:
				return getThreats();
			case PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY:
				return getSamplingstrategy();
			case PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS:
				return getApparatus();
			case PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES:
				return getDependentVariables();
			case PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES:
				return getIndependentvariables();
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
			case PlanningPackage.EXPERIMENTAL_PLAN__THREATS:
				setThreats((Threats)newValue);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY:
				setSamplingstrategy((SamplingStrategy)newValue);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS:
				setApparatus((PiecesOfApparatus)newValue);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES:
				setDependentVariables((DependentVariables)newValue);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES:
				setIndependentvariables((IndependentVariables)newValue);
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
			case PlanningPackage.EXPERIMENTAL_PLAN__THREATS:
				setThreats((Threats)null);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY:
				setSamplingstrategy((SamplingStrategy)null);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS:
				setApparatus((PiecesOfApparatus)null);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES:
				setDependentVariables((DependentVariables)null);
				return;
			case PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES:
				setIndependentvariables((IndependentVariables)null);
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
			case PlanningPackage.EXPERIMENTAL_PLAN__THREATS:
				return threats != null;
			case PlanningPackage.EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY:
				return samplingstrategy != null;
			case PlanningPackage.EXPERIMENTAL_PLAN__APPARATUS:
				return apparatus != null;
			case PlanningPackage.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES:
				return dependentVariables != null;
			case PlanningPackage.EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES:
				return independentvariables != null;
		}
		return super.eIsSet(featureID);
	}

} //ExperimentalPlanImpl
